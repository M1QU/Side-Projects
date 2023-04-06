
package Races;

/**
 *
 * @author Owner
 */
public class Human {
        private String name;
    private int age;
    private String background;
    private String language;

    // Constructor
    public Human(String name, int age, String background, String language) {
        this.name = name;
        this.age = age;
        this.background = background;
        this.language = language;
    }

    // Getter and Setter methods for name
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    // Getter and Setter methods for age
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    // Getter and Setter methods for background
    public void setBackground(String background) {
        this.background = background;
    }
    public String getBackground() {
        return background;
    }

    // Getter and Setter methods for language
    public void setLanguage(String language) {
        this.language = language;
    }
    public String getLanguage() {
        return language;
    }
}

