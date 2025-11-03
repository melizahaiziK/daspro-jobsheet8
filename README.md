PERTANYAAN PERCOBAAN 1 :
1. Jika pada perulangan for, inisialisasi i=1 diubah menjadi i=0, apa akibatnya? mengapa bisa demikian?
jawaban : akibatnya adalah bintang menjadi bertambah 1 ketika program dijalankan. Hal ini terjadi karena jika i dimulai dari 0 dan berhenti saat i lebih besar dari N, maka nilai terakhir nya adalah N + 1 karena i nya dimulai dari angka 0.

2. Jika pada perulangan for, kondisi i<=N diubah menjadi i>N, apa akibatnya? Mengapa demikian?
jawaban :output tidak mengeluarkan hasilnya, dikarenakan i bernilai lebih kecil dari N dan karena pada awalnya nilai i tidak memenuhi syarat tersebut. 

3. Jika pada perulangan for, kondisi step i++ diubah menjadi i-- apa akibatnya? Mengapa demikian?
jawaban :loop akan berjalan tanpa henti, karena nilai i makin kecil sementara kondisi i <= N tetap benar seterusnya.



PERTANYAAN PERCOBAAN 2 :
1. Perhatikan perulangan luar. Jika pada sintaks for, inisialisasi iOuter=1 diubah menjadi ¡Outer=0, apa yang akibatnya? Mengapa bisa demikian?
jawaban : akan terjadi error yang bertulis "invalid character" 
 
2. Kembalikan program semula dimana inisialisasi iOuter=1. Kemudian perhatikan perulangan dalam, Jika pada sintaks for, inisialisasi i=1 diubah menjadi i=0, apa yang akibatnya? Mengapa bisa demikian?
jawaban :akibatnya adalah bintang menjadi bertambah 1 ketika program dijalankan. Hal ini terjadi karena jika i dimulai dari 0 dan berhenti saat i lebih besar dari N, maka nilai terakhir nya adalah N + 1 karena i nya dimulai dari angka 0.

3. Jadi, apakah perbedaan kegunaan antara perulangan luar dengan perulangan yang berada didalamnya?
jawaban :outer loop : Setiap satu kali perulangan luar berjalan maka perulangan dalam akan dijalankan sesuai jumlah N.

inner loop : Setelah inner loop selesai akan membuat baris baru yaitu outer loop lanjut ke baris berikutnya, ini akan mengulang terus menerus sampai jumlah N yang dituliskan. 

4. Mengapa perlu ditambahkan sintaks System.out.println(); di bawah perulangan dalam? Apa akibatnya jika sintaks tersebut dihilangkan?
jawaban :perlu ditambahkan untuk memberikan jarak pada bintang bintang agar sesusai dengan nilai N yang diinputkan. Jika sintaks tersebut dihilangkan, maka baris bintang tidak akan berjarak, dan akan menggabung satu deret.



PERTANYAAN PERCOBAAN 3 :
1. Perhatikan, apakah output yang dihasilkan dengan nilai N = 5 sesuai dengan tampilan berikut? 
jawaban : tidak sama.

2. jika tidak sesuai, bagian mana saja yang harus diperbaiki/ditambahkan? jelaskan setiap bagian yang perlu diperbaiki/ditambahkan!
jawaban : yang seharusnya diperbaiki adalah i=0 itu seharusnya i=1 agar baris pertama langsung berisi satu bintang. Dan yang ditambahakan adalah System.out.println() karena agar setiap baris bintang berpindah ke baris baru