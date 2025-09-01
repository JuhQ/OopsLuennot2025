import java.io.*;

class Person implements Serializable {
    private String firstname;
    private String lastname;
    private int birthYear;

    public Person() {
        firstname = "";
        lastname = "";
        birthYear = 0;
    }

    public Person(String firstname, String lastname, int birthYear) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthYear = birthYear;
    }

    public String getName() {
        return firstname + " " + lastname;
    }

    @Override
    public String toString() {
        return firstname + " " + lastname + " " + birthYear + " years";
    }
}

public class Main {

    private final static String FILENAME = "person.dat";

    public static void main(String[] args) {
        File f = new File(FILENAME);
        Person person = new Person();

        System.out.println(person);

        if (f.exists() && f.isFile()) {
            try (
                    FileInputStream inputStream = new FileInputStream(FILENAME);
                    ObjectInputStream objects = new ObjectInputStream(inputStream);
            ) {
                person = (Person) objects.readObject();
                System.out.println("uusiokäytetään levylle tallennettua person objektia");
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            person = new Person("Juha", "Lastname", 1000);
            System.out.println("Luodaan uusi");
            try(
                    FileOutputStream outputStream = new FileOutputStream(FILENAME);
                    ObjectOutputStream objects = new ObjectOutputStream(outputStream);
                    ) {
                objects.writeObject(person);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

        System.out.println(person);

    }
}