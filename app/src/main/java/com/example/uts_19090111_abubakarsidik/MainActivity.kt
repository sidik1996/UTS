package com.example.uts_19090111_abubakarsidik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()


        //Simpan data

        data?.add(DataModel(R.drawable.jahe,"seluruh daerah","jahe","Jahe adalah salah satujenis tanaman obat yang sudah tidak asing lagi. Apalagi, terdapat kandungan gingerol yang merupakan zat antiradang dan antioksidan tinggi.\n" +
                "Beberapa manfaat jahe untuk kesehatan tubuh adalah membantu mengatasi sakit perut, mual, muntah, pusing akibat vertigo, sakit kepala, nyeri haid, hingga meredakan rematik dan osteoarthritis.\n" +
                "Walaupun tergolong aman, sebaiknya Anda tidak mengonsumsinya lebih dari 5 gram atau setara dengan 1 sendok teh setiap harinya.\n" +
                "Mengonsumsi jahe secara berlebihan berisiko meningkatkan berbagai efek samping, seperti perut kembung, sakit perut, heartburn, hingga iritasi pada mulut."))

        data?.add(DataModel(R.drawable.kencur,"seluruh daerah","kencur", "Kaempferia galanga atau kencur juga menjadi salah satu jenis tanaman obat alami yang juga memiliki banyak manfaat bagi kesehatan. Di antaranya sebagai penambah nafsu makan dan stamina tubuh, serta melancarkan haid.\n" +
                "Lalu, kencur juga bermanfaat untuk membantu mengatasi gangguan kesehatan, seperti flu, masuk angin, diare, batuk, sakit kepala, dan radang lambung."))

        data?.add(DataModel(R.drawable.kumiskucing,"seluruh daerah","kumiskucing", "Kumis kucing umumnya juga kerap digunakan sebagai salah satu jenis tanaman apotek hidup di rumah.\n" +
                "Jenis tanaman obat alami ini biasanya digunakan untuk mengatasi penyakit ginjal, radang kandung kemih, kencing batu, diabetes, dan asam urat"))

        data?.add(DataModel(R.drawable.kunyit,"seluuruh daerah","kunyit", "Menjadi salah satu jenis tanaman obat apotek hidup di rumah, kunyit juga dimanfaatkan untuk bumbu dapur, jamu, hingga produk kecantikan.\n" +
                "Manfaat kunyit untuk kesehatan tak terlepas dari kandungan zat kurkumin. Sebagai contoh, membantu menjaga sistem pencernaan, menurunkan kolesterol, menurunkan kadar gula darah, hingga mengurangi risiko penyakit jantung.\n" +
                "Namun, orang yang punya masalah lambung, seperti maag dan GERD, serta yang sedang rutin menggunakan obat pengencer darah tidak disarankan terlalu banyak mengonsumsi kunyit."))

        data?.add(DataModel(R.drawable.lengkuas,"seluruh daerah","lengkuas", "Lengkuas atau laos mengandung galangin, beta-sitosterol, dan flavonoid yang baik bagi tubuh. Selain itu, jenis tanaman obat alami ini juga mengandung vitamin A, vitamin C, zat besi, dan juga serat.\n" +
                "Beberapa manfaat lengkuas untuk kesehatan tubuh adalah sebagai antioksidan, mengurangi nyeri dan peradangan, melawan infeksi, men\n" +
                "ingkatkan kesuburan pria, serta berpotensi sebagai antikanker."))

        data?.add(DataModel(R.drawable.lidahbuaya,"seluruh daerah","lidahbuaya", "Lidah buaya adalah tanaman obat keluarga lainnya yang juga bermanfaat untuk kecantikan. Ini bisa Anda coba mengoleskannya ke kulit,rambut, atau mengonsumsinya secara langsung.\n" +
                "Beberapa manfaat lidah buaya, antara lain menyembuhkan luka, meningkatkan kesehatan pencernaan, menjaga kesehatan mulut, hingga mengobati jerawat.\n" +
                "Umumnya, penggunaan lidah buaya pada kulit aman dilakukan untuk jenis luka yang tergolong ringan. Jika Anda mengonsumsi secara langsung, perhatikan apakah muncul tanda-tanda alergi.\n" +
                "Wanita yang sedang hamil, ibu menyusui, dan anak berusia di bawah 12 tahun, tidak disarankan untuk mengonsumsinya secara langsung."))

        data?.add(DataModel(R.drawable.temulawak,"seluruh daerah","temulawak", "Temulawak adalah jenis obat tradisional yang dapat digunakan untuk mengatasi gangguan pencernaan, seperti irritable bowel syndrome (IBS), perut kembung setelah makan, dan gangguan lambung.\n" +
                "Tanaman yang dapat dijadikan obat ini juga bermanfaat sebagai penambah nafsu makan. Namun, ada efek samping jika dikonsumsi secara berlebihan dalam jangka panjang, seperti mengakibatkan iritasi pada lambung hingga muntah."))





        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("harga", item?.daerah)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}