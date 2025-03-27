/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LATIHAN_961;

/**
 *
 * @author USER
 */
public class Latihan_961 {
    public static void main(String[] args) {
        String classDef = "Class adalah blueprint atau template yang digunakan untuk membuat objek. " +
                          "Class mendefinisikan atribut (data) dan metode (fungsi) yang dimiliki oleh objek yang dihasilkan dari class tersebut.";

        String objectDef = "Object adalah instance dari class. Setiap objek memiliki state (nilai dari atribut) " +
                           "dan behavior (metode yang dapat dipanggil) yang ditentukan oleh class-nya.";

        String instantiateDef = "Instantiate adalah proses pembuatan objek dari class. " +
                                "Ini dilakukan dengan menggunakan operator 'new' diikuti dengan constructor class.";

        String instanceVariableDef = "Instance variable adalah variabel yang dideklarasikan dalam sebuah class tetapi di luar metode. " +
                                      "Setiap objek dari class tersebut memiliki salinan dari instance variable ini.";

        String instanceMethodDef = "Instance method adalah metode yang dapat dipanggil pada objek dari class. " +
                                    "Metode ini dapat mengakses instance variable dan melakukan operasi pada objek tersebut.";

        String classVariableDef = "Class variables adalah variabel yang dideklarasikan dengan kata kunci 'static'. " +
                                  "Variabel ini dimiliki oleh seluruh objek dari class yang sama dan memiliki nilai yang sama untuk semua objek.";

        String constructorDef = "Constructor adalah metode khusus dalam class yang dipanggil saat objek dibuat. " +
                                "Constructor biasanya digunakan untuk menginisialisasi instance variable objek.";

        System.out.println("1. Class: " + classDef);
        System.out.println("2. Object: " + objectDef);
        System.out.println("3. Instantiate: " + instantiateDef);
        System.out.println("4. Instance Variable: " + instanceVariableDef);
        System.out.println("5. Instance Method: " + instanceMethodDef);
        System.out.println("6. Class Variables: " + classVariableDef);
        System.out.println("7. Constructor: " + constructorDef);
    }
}
