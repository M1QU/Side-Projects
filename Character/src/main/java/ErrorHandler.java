



import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;



/**
 *------------------READ ME: ----------------------
 * To use this Error Handler and trouble shooter:
 * 
 * 1.) Create Package "troubleshoot.errorhandler".
 * 2.) Import package to project.
 * 3.) Create an instance of the "ErrorHandler" class.
 * 4.) Pass in your code as a STRING VARIABLE / OBJ.
 * ------------------------------------------------
 * Example:
 * String code = " {  "+                           (Assigning code to a String "code")
 * " System.out.prinln("Hello"); "+               (Broken code)
 * " } ";
 * ErrorHandler fixIt = new ErrorHandler(); (New instance of "ErrorHandler")
 * 
 * fixIt.troubleshoot(code);       (String "code" is in (), it will check 
 *                                        the code and offer possible solutions)
 * Also:
 * (If the code compiles and runs w/o error, 
 * the "ErrorHandler" will return the output of the code)
 */
public class ErrorHandler {

    private List<String> errors;
    private String className;

    public ErrorHandler() {
        this.errors = new ArrayList<>();
    }

    public void addError(String error) {
        errors.add(error);
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    public void printErrors() {

        for (String error : errors) {
            System.err.println("ERROR: " + error);
        }
    }

    public void troubleshoot(String code) {
        try {
// Compile the code to a class object
            className = Compiler.compile(code);

// Check for runtime errors
            Object result = Runner.run(className);

// If there are no runtime errors, print a success message and the output
            if (result != null) {
                System.out.println("Code executed successfully! Output:");
                System.out.println(result);
            } else {
                System.out.println("Code executed successfully with no output.");
            }

        } catch (CompilerException e) {
// If there is a compilation error, extract the error message and add it to the list of errors
            String errorMessage = e.getMessage();
            if (errorMessage != null) {
                addError(errorMessage);
            }

// Print the error message and possible solutions for the user
            System.err.println("Could not compile code due to the following error:");
            System.err.println(errorMessage);
            System.err.println("Possible solutions:");
            System.err.println(" - Check your syntax for errors such as missing semicolons or misspelled keywords");
            System.err.println(" - Check that all variable names and types match correctly");
            System.err.println(" - Check for mismatched brackets or parentheses");
            System.err.println(" - Check that all required libraries are properly imported");

        } catch (RunnerException e) {
// If there is a runtime error, extract the error message and add it to the list of errors
            String errorMessage = e.getMessage();
            if (errorMessage != null) {
                addError(errorMessage);
            }

// Print the error message and possible solutions for the user
            System.err.println("Could not execute code due to the following error:");
            System.err.println(errorMessage);
            System.err.println("Possible solutions:");
            System.err.println(" - Check that all variable values are properly initialized");
            System.err.println(" - Check for null pointers or out of bounds exceptions");
            System.err.println(" - Check your code logic for errors");
        }

// If there are any errors, print them
        if (hasErrors()) {
            System.err.println("The following errors were found: ");
            printErrors();

        }
    }

    private static class Compiler {

        public static String compile(String code) throws CompilerException {
            try {
// Create an instance of a compiler
                Class<?> compilerClass = Class.forName("javax.tools.ToolProvider");
                Method getSystemJavaCompiler
                        = compilerClass.getDeclaredMethod("getSystemJavaCompiler");
                Object javaCompiler = getSystemJavaCompiler.invoke(null);

// Compile the code
                StringWriter sw = new StringWriter();
                PrintWriter pw = new PrintWriter(sw);
                Class<?> standardJavaFileManager = Class.forName("javax.tools.StandardJavaFileManager");
                Method getJavaFileObjectsFromString
                        = compilerClass.getDeclaredMethod("getJavaFileObjectsFromString", String[].class);
                Object fileManager
                        = standardJavaFileManager.cast(compilerClass.getMethod("getStandardFileManager", PrintWriter.class, null, null).invoke(javaCompiler, pw, null, null));
                Iterable<?> units = (Iterable<?>) getJavaFileObjectsFromString.invoke(javaCompiler, new Object[]{new String[]{code}});
                Class<?> compilationTask = Class.forName("javax.tools.JavaCompiler$CompilationTask");
                Method getTask = compilerClass.getDeclaredMethod("getTask", PrintWriter.class, standardJavaFileManager, null, null, Iterable.class);
                Object task = getTask.invoke(javaCompiler, pw, fileManager, null, null, units);
                Boolean result = (Boolean) compilationTask.getMethod("call").invoke(task);

// If compilation is successful, return the name of the compiled class
                if (result) {
                    return units.iterator().next().getClass().getName();
                } else {
                    throw new CompilerException(sw.toString());
                }
            } catch (ClassNotFoundException | NoSuchMethodException | SecurityException
                    | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                throw new CompilerException("Compiler not found. Please ensure that the JDK is installed and added to the system PATH.");
            }
        }
    }

    private static class Runner {

        public static Object run(String className) throws RunnerException {
            try {
// Create an instance of the compiled class and run its main method
                Class<?> cls = Class.forName(className);
                Method mainMethod = cls.getMethod("main", String[].class);
                mainMethod.invoke(null, (Object) new String[]{});

// If the main method produces output, return it
                Method outputMethod = cls.getMethod("output");
                return outputMethod.invoke(null);

            } catch (ClassNotFoundException | NoSuchMethodException | SecurityException
                    | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                throw new RunnerException("Class not found or does not contain a main method.");
            }

        }
    }

    private static class CompilerException extends Exception {

        private static final long serialVersionUID = 1L;

        public CompilerException(String message) {
            super(message);
        }
    }

    private static class RunnerException extends Exception {

        private static final long serialVersionUID = 1L;

        public RunnerException(String message) {
            super(message);
        }
    }
}
