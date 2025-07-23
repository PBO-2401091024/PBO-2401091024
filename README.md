Repositori ini berisi kumpulan proyek pemrograman berorientasi objek (PBO) yang dikembangkan oleh Muhammad Rizki Halim (NIM: 2401091024) sebagai bagian dari tugas 
dan latihan pada mata kuliah Pemrograman Berorientasi Objek.

Berikut adalah projek-projek saya.
Latihan 4.11
4.11.2 – Menghitung Nilai Rata-Rata dari Tiga Angka
Latihan ini bertujuan untuk melatih penggunaan operator aritmatika sederhana serta cara menyimpan dan mencetak nilai dari beberapa variabel.
Program membuat tiga buah variabel bertipe int yang masing-masing diisi dengan angka 10, 20, dan 45. 
Kemudian, program menghitung nilai rata-rata dari ketiga angka tersebut menggunakan operasi (number1 + number2 + number3) / 3, 
lalu mencetak hasilnya ke layar.
4.11.3 – Menentukan Nilai Terbesar dari Tiga Angka
Tujuan latihan ini adalah melatih logika perbandingan menggunakan operator kondisi ?: (ternary operator) untuk mencari nilai terbesar dari tiga buah angka.
Program menyimpan tiga angka ke dalam variabel, yaitu 10, 23, dan 5. Untuk menentukan angka mana yang paling besar, 
digunakan dua set operator ternary secara bersarang. Konsep ini mengajarkan bagaimana kondisi kompleks bisa disederhanakan tanpa menggunakan if-else.
4.11.4 – Operator Precedence (Prioritas Operator)
Latihan ini tidak melibatkan kode program, tetapi bertujuan untuk memahami urutan prioritas operator dalam ekspresi matematika di Java. 
Diberikan beberapa ekspresi kompleks, tugasnya adalah menuliskan ulang ekspresi tersebut dengan tanda kurung untuk menunjukkan urutan eksekusinya.
Contoh:
a / b ^ c ^ d – e + f – g * h + i
Menjadi: (((a / (b ^ (c ^ d))) - e) + f - (g * h)) + i
3 * 10 * 2 / 15 – 2 + 4 ^ 2 ^ 2
Menjadi: (((3 * 10 * 2) / 15) - 2) + (4 ^ (2 ^ 2))
r ^ s * t / u – v + w ^ x – y++
Menjadi: (((r ^ (s * t)) / u) - v) + (w ^ x) - y++
Latihan ini sangat penting agar program tidak menghasilkan nilai yang salah akibat kesalahan dalam penempatan operator.

Latihan 5.1
5.1.1 – Kata Terakhir (Menggunakan BufferedReader)
Latihan ini mengajarkan bagaimana cara membaca input dari pengguna menggunakan BufferedReader, salah satu metode input standar di Java sebelum era Scanner.
Program meminta pengguna untuk memasukkan tiga kata secara berurutan. Setiap input disimpan ke dalam variabel string. 
Setelah semua input diterima, program mencetak ketiga kata tersebut dalam satu baris, dipisahkan oleh spasi.
Melalui latihan ini, pengguna diperkenalkan pada konsep:
-Penggunaan BufferedReader dan InputStreamReader
-Pembacaan input bertipe String
-Penggabungan string dan output terformat
5.1.2 – Kata Terakhir (Versi JOptionPane)
Latihan ini memperkenalkan penggunaan kelas JOptionPane dari pustaka javax.swing, yang memungkinkan pembuatan antarmuka grafis sederhana berbasis dialog pop-up di Java. 
Program bertujuan untuk meminta pengguna memasukkan tiga buah kata secara bergantian melalui kotak dialog input, 
lalu menampilkan ketiga kata tersebut sebagai satu kalimat dalam dialog pesan.

Latihan 6.5
6.5.1 – Nilai Rata-Rata Ujian dan Ekspresi Wajah
Latihan ini bertujuan menghitung nilai rata-rata dari tiga ujian yang dimasukkan oleh pengguna. 
Setelah mendapatkan ketiga nilai tersebut, program menghitung rata-ratanya dan menampilkan ekspresi wajah berdasarkan hasil perhitungan.
Program membaca tiga nilai ujian dari pengguna menggunakan BufferedReader, lalu menghitung rata-ratanya dengan rumus (nilai1 + nilai2 + nilai3) / 3. 
Jika rata-rata tersebut ≥ 60, maka ditampilkan wajah tersenyum :). Jika kurang dari itu, maka ditampilkan :(.
6.5.2 – Membaca Bilangan
Tujuan dari latihan ini adalah mengenalkan dua pendekatan kontrol alur (if-else dan switch) untuk memproses input bilangan dan mencetak padanannya dalam bentuk teks.
Ketentuan:
-Program meminta pengguna memasukkan satu angka antara 1–10.
-Jika input valid, program menampilkan angka tersebut dalam bentuk kata.
-Jika input tidak sesuai, program mencetak “Invalid number”.
6.5.3 – Mencetak Nama Sebanyak 100 Kali
Latihan ini melatih penggunaan tiga jenis perulangan (while, do-while, dan for) dengan tugas sederhana: mencetak nama pengguna sebanyak 100 kali ke layar.
Versi 1 – while loop
Menggunakan kondisi yang dicek di awal sebelum perulangan dijalankan.
Versi 2 – do-while loop
Menjalankan blok perulangan minimal satu kali, lalu mengecek kondisi.
Versi 3 – for loop
Cara paling ringkas untuk perulangan dengan jumlah tetap, yakni dari 1 hingga 100.
6.5.4 – Perpangkatan
Latihan ini bertujuan menghitung hasil perpangkatan dari sebuah bilangan pokok dengan eksponen tertentu. Terdapat tiga versi penyelesaian, masing-masing menggunakan jenis perulangan yang berbeda.
Contoh:
Input angka = 2, pangkat = 4 → Output: 16 (karena 2⁴ = 16)
Versi 1 – while loop
Memulai dengan nilai hasil = 1, lalu dikalikan dengan basis sebanyak eksponen kali.
Versi 2 – do-while loop
Logika serupa, tapi memastikan perulangan terjadi minimal satu kali.
Versi 3 – for loop
Menggunakan struktur yang lebih kompak, melakukan pengulangan sebanyak jumlah eksponen.

Latihan 7.7
7.7.1 Hari dalam Seminggu
Program dimulai dengan membuat sebuah array bertipe String yang berisi nama-nama hari dalam satu minggu. 
Array tersebut mencakup nilai-nilai dari "Monday" hingga "Sunday". Untuk mencetak seluruh elemen dari array tersebut, program menggunakan tiga jenis perulangan berbeda: 
while, do-while, dan for-loop. Setiap loop digunakan secara terpisah untuk menampilkan seluruh isi array ke layar, dimulai dari indeks 0 hingga akhir array, 
dengan memanfaatkan properti .length agar program dapat menyesuaikan panjang array secara dinamis.
7.7.2 Nomor Terbesar
Pada bagian ini, program memanfaatkan BufferedReader dan JOptionPane untuk meminta pengguna memasukkan 10 angka secara bertahap. 
Setiap angka yang dimasukkan disimpan ke dalam array bertipe int. Setelah semua angka dikumpulkan, program melakukan iterasi terhadap isi array 
untuk mencari nilai terbesar menggunakan perbandingan sederhana. Nilai tertinggi yang ditemukan kemudian ditampilkan kepada pengguna melalui output dialog atau konsol.
7.7.3 Buku Alamat
Program ini menggunakan array dua dimensi bertipe String untuk menyimpan data buku alamat. Masing-masing baris array mewakili satu entri, dengan tiga kolom yang menyimpan:
Nama, Nomor telepon, dan Alamat.
Data diakses satu per satu melalui nested-loop (atau akses langsung indeks), dan dicetak dalam format yang terstruktur, misalnya:
Name : Florence  
Tel. # : 735-1234  
Address : Manila  
Setiap entri dipisahkan dengan baris kosong untuk meningkatkan keterbacaan.

Latihan 8.4
8.4.1 – Mencetak Argumen
Latihan ini bertujuan untuk memahami cara kerja argumen baris perintah (command line arguments) di Java. 
Program akan menerima sejumlah kata dari pengguna yang diketikkan saat program dijalankan, 
kemudian mencetak setiap kata tersebut ke layar secara terpisah dalam baris-baris baru. 
Konsep ini penting untuk memahami bagaimana data bisa dikirimkan ke dalam program sejak awal eksekusi, tanpa input manual saat program berjalan.
8.4.2 – Operasi Aritmatika
Latihan ini melanjutkan penggunaan argumen baris perintah, namun kali ini dengan fokus pada pengolahan angka. 
Program menerima dua buah angka dari argumen, kemudian menghitung hasil penjumlahan, pengurangan, perkalian, dan pembagiannya. 
Hasil dari setiap operasi ditampilkan ke layar dalam bentuk output yang terstruktur. 
Latihan ini mengajarkan cara mengonversi data teks (string) ke bilangan bulat serta dasar-dasar operasi aritmatika dalam konteks input eksternal.

Latihan 9.6
9.6.1 – Mendefinisikan Istilah Pemrograman Berbasis Objek
Latihan ini meminta pengguna untuk memahami dan menjelaskan konsep-konsep fundamental dalam pemrograman berorientasi objek (OOP). 
Istilah-istilah yang perlu dijelaskan antara lain: class, object, instantiate, instance variable, instance method, static member, dan constructor. 
Tujuan latihan ini adalah memastikan pengguna memahami peran dan fungsi masing-masing komponen dalam struktur OOP sebelum mengimplementasikannya secara nyata.
9.6.2 – Java Scavenger Hunt
Latihan ini bersifat eksploratif: pengguna diminta mencari tahu bagaimana menggunakan method-method tertentu dari pustaka Java (API Java), 
tanpa mengandalkan internet atau dokumentasi langsung. Setiap soal mengarahkan pengguna untuk menyebutkan:
Nama class tempat method berada
Bentuk deklarasi method-nya
Contoh penggunaannya dalam program
Sebagai contoh, jika diminta cara mengubah string menjadi integer, pengguna harus tahu bahwa class Integer menyediakan method parseInt(). 
Latihan ini membantu pengguna mengenali dan memahami API Java secara mandiri, yang sangat berguna saat membangun program nyata nantinya.

Latihan 10.10
10.10.1 Entry Buku Alamat
Program dimulai dengan membuat sebuah class yang merepresentasikan entri dalam buku alamat. Di dalam class ini terdapat empat atribut penting, yaitu:
nama: menyimpan nama lengkap seseorang.
alamat: berisi alamat lengkap tempat tinggal atau domisili.
nomorTelepon: menyimpan nomor telepon pribadi.
alamatEmail: menyimpan alamat email pribadi.
Setiap atribut dilengkapi dengan accessor (getter) dan mutator (setter), yang memungkinkan pengguna untuk membaca dan mengubah nilai dari atribut-atribut tersebut. 
Sebuah constructor juga diimplementasikan untuk menginisialisasi seluruh atribut saat objek dibuat.
10.10.2 Buku Alamat
Bagian ini melanjutkan pengembangan dari entri buku alamat dengan membuat class baru yang mampu menyimpan hingga 100 entri.
Program mengimplementasikan method-method berikut:
1. Memasukkan data
Program menyediakan mekanisme untuk menambahkan data entri baru ke dalam daftar buku alamat, selama jumlah entri belum melebihi batas maksimum.
2. Menghapus data
Program menyediakan kemampuan untuk menghapus entri tertentu berdasarkan identifikasi yang sesuai (misalnya nama atau indeks).
3. Menampilkan seluruh data
Seluruh entri yang tersimpan dalam buku alamat dapat ditampilkan ke layar dengan mencetak informasi lengkap dari masing-masing entri.
4. Update data
Program memungkinkan pengguna untuk memperbarui informasi pada entri tertentu, baik sebagian maupun seluruh atributnya.

Latihan 11.6
11.6.1 – Extend StudentRecord
Program dimulai dengan mengembangkan sebuah class bernama StudentRecord yang telah dibuat sebelumnya.
Kemudian, sebuah subclass baru ditambahkan untuk memperluas fungsionalitas tersebut dengan atribut atau method tambahan terkait pengetahuan komputer siswa.
Subclass ini mewarisi seluruh atribut dan method dari StudentRecord, dan dapat meng-override beberapa method penting dari superclass apabila diperlukan. 
Misalnya, jika terdapat method getGrade() dalam StudentRecord, subclass dapat memberikan perhitungan nilai yang lebih spesifik atau menyesuaikan output berdasarkan 
kemampuan komputer siswa. Dengan pendekatan ini, program mendemonstrasikan prinsip inheritance dan polymorphism dalam Java, di mana object dari 
subclass dapat digunakan secara fleksibel sebagai object dari superclass, sambil mempertahankan perilaku spesifiknya sendiri.
11.6.2 – Abstract Class Shape
Program ini dimulai dengan mendefinisikan sebuah class abstract bernama Shape. Di dalamnya terdapat dua method abstract yaitu:
getArea(): untuk menghitung luas bangun datar.
getName(): untuk memberikan nama bentuk geometri.
Dua subclass yaitu Circle dan Square dibuat untuk mewarisi dari Shape. Masing-masing subclass menyediakan implementasi konkret untuk kedua method abstract tersebut:
Pada Circle, luas dihitung menggunakan rumus π * r², dan nama bentuknya adalah "Circle".
Pada Square, luas dihitung dengan rumus sisi * sisi, dan nama bentuknya adalah "Square".
Dengan pendekatan ini, program mencontohkan penggunaan abstract class untuk mendefinisikan perilaku umum yang kemudian harus diimplementasikan oleh subclass-subclass spesifik.

Latihan 12.4
12.4.1 – Menangkap Exception 1
Program dimulai dengan mendeklarasikan method main yang berisi sebuah loop for tak terbatas. Di dalam loop ini, program mencoba mencetak setiap elemen dari 
array args menggunakan System.out.println("args["+i+"]="+ args[i]). Selama ada elemen dalam args, program akan terus mencetak isi array ke layar. 
Namun, saat indeks i melebihi panjang array, program akan menimbulkan exception ArrayIndexOutOfBoundsException, karena mencoba mengakses elemen di luar batas array.
Untuk mengatasi masalah ini, program dimodifikasi menggunakan blok try-catch. Bagian yang berpotensi menimbulkan exception ditempatkan dalam try, 
dan jika terjadi error, maka akan ditangkap oleh blok catch, yang mencetak pesan:
Exception caught:
java.lang.ArrayIndexOutOfBoundsException: [nomor indeks]
Quiting...
Dengan cara ini, program tidak langsung berhenti secara tiba-tiba, melainkan mengatasi error tersebut secara terkendali.
12.4.2 – Menangkap Exception 2
Bagian ini merupakan kelanjutan dari latihan sebelumnya, dengan tujuan menguji program yang belum menggunakan penanganan exception. 
Tanpa blok try-catch, program langsung berhenti saat exception terjadi.
Pada latihan ini, pengguna diminta kembali mengimplementasikan blok try-catch agar program dapat menangani kondisi exception dengan aman. 
Dengan adanya penanganan ini, program dapat mencetak semua argumen yang tersedia tanpa crash, lalu menampilkan pesan error yang ditangkap dan mengakhiri program secara baik-baik.
Latihan ini mengajarkan pentingnya exception handling untuk menjaga stabilitas program dan memberikan pengalaman yang lebih baik bagi pengguna saat terjadi kesalahan.

















