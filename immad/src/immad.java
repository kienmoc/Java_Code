import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;

public class immad {

    public static void main(String[] args) throws IOException, ParseException, NumberFormatException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Teacher> hm = new HashMap<>();
        int T = Integer.parseInt (sc.nextLine ());
        while (T-- > 0) {
            String[] word = sc.nextLine ().trim ().split ("\\s+");
            // String id = word[0];
        }
        T = Integer.parseInt (sc.nextLine ());
        while (T-- > 0) {
            String[] word = sc.nextLine ().trim ().split ("\\s+");
            String id = word[0];
            String name = "";
            for (int i = 1; i < word.length; i++) {
                name += word[i] + " ";
            }
            Teacher t = new Teacher(id, name.trim ());
            hm.put (id, t);
        }
        T = Integer.parseInt (sc.nextLine ());
        while (T-- > 0) {
            String[] word = sc.nextLine ().trim ().split ("\\s+");
            String id = word[0];
            double hour = Double.parseDouble(word[2]);
            Teacher t = hm.get (id);
            t.hour = hour;
            System.out.println(t);
        }
    }
}

class Teacher {
    public String id, name;
    public double hour;

    public Teacher (String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString () {
        return name + " " + String.format ("%.2f", hour);
    }
}