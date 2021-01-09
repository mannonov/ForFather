package uz.najottalim.forefather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        recyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));

        ArrayList<Scientist>scientists = new ArrayList<>();

        scientists.add(new Scientist("Amir Temur (1336-1405)","Amir Temur ilk harbiy faoliyatini qoʻl ostidagi navkarlari bilan ayrim viloyat amirlariga xizmat qilishdan boshlagan; ularning oʻzaro kurashlarida qatnashib, jasorat koʻrsatgan, janglarda chiniqqan, harbiy mahoratini oshirgan.","https://firebasestorage.googleapis.com/v0/b/forefather-a18bf.appspot.com/o/Amir-Temur-239x300-1.jpg?alt=media&token=783fd335-b0eb-4266-a769-b54d75a0fd47","https://uz.wikipedia.org/wiki/Amir_Temur"));
        scientists.add(new Scientist("Alisher Navoiy (1441-1501)","Ali Yazdiy nazariga tushgan, Mavlono Lutfiy yosh shoir isteʼdodiga yuqori baho bergan, Kamol Turbatiy eʼtirofini qozongan. Sayyid Hasan Ardasher, Pahlavon Muhammad kabi ustozlardan taʼlim olgan, Abdurahmon Jomiy bilan ijodiy hamkorlikda boʻlgan. Navoiy 1469-yilgacha temuriylar orasidagi ichki nizolar sababli Hirotdan yiroqroqda yashagan.","https://firebasestorage.googleapis.com/v0/b/forefather-a18bf.appspot.com/o/alish.jpg?alt=media&token=208ac1c2-9029-4185-aff2-358be8f6d44b","https://uz.wikipedia.org/wiki/Alisher_Navoiy"));
        scientists.add(new Scientist("Al-Xorazmiy (753-850)","Dastlabki maʼlumotni Xiva shahrida olgan va yetuk olim boʻlib shakllangan. Bunda arab istilosidan soʻng muayyan darajada saqlanib qolgan qadimgi Xorazm fani anʼanalari asosiy rol oʻynagan. Xalifa Horun ar Rashidning oʻgʻli va uning Xurosondagi voliysi al Maʼmun huzuriga – Marvga taklif etilgan","https://firebasestorage.googleapis.com/v0/b/forefather-a18bf.appspot.com/o/xorazmiy.jpg?alt=media&token=fab85dfb-e02a-4e54-9391-3e1b6b0f8189","https://uz.wikipedia.org/wiki/Al-Xorazmiy"));
        scientists.add(new Scientist("Abu Rayhon Beruniy (973-1048)","Xorazmlik ulugʻ alloma abu Rayhon Beruniy ota-onasidan juda yosh yetim qolgan va Iroqiylar xonadonida tarbiyalangan. Iroqiylarning oxirgi vakili Xorazmshoh, Abu Abdulloh Muhammad ibn Ahmad ibn Iroq hisoblanadi. Xorazmshohning jiyani — amakisining oʻgʻli Abu Nasr Mansur ibn Iroq Beruniyning ustozi edi.","https://firebasestorage.googleapis.com/v0/b/forefather-a18bf.appspot.com/o/beruniy.jpg?alt=media&token=4652ae11-ed41-403e-81b8-a659708a3fec","https://uz.wikipedia.org/wiki/Abu_Rayhon_Beruniy"));
        scientists.add(new Scientist("Abu Ali ibn Sino (930-1037)","Ibn Sinoning otasi Abdulloh Balx shahridan boʻlib, Somoniylar amiri Nuh ibn Mansur (967—997) davrida Buxoro tomoniga koʻchib, Hurmaysan qishlogʻiga moliya amaldori etib tayinlanadi. U Afshona qishlogʻida Sitora ismli qizga uylanib ikki oʻgʻil farzand koʻradi. Oʻgʻillarining kattasi Husayn (Ibn Sino), kenjasi Mahmud edi. Husayn 5 yoshga kirgach, Ibn Sinolar oilasi poytaxt — Buxoroga koʻchib keladi va uni oʻqishga beradilar.","https://firebasestorage.googleapis.com/v0/b/forefather-a18bf.appspot.com/o/abu_ali_ibn.jpg?alt=media&token=054350e4-11c2-41ff-a212-40dab9fef391","https://uz.wikipedia.org/wiki/Abu_Ali_ibn_Sino"));
        scientists.add(new Scientist("Zahiriddin Muhammad ibn" +
                " Umarshayx Mirzo (1483-153)","Bobur o‘z davrining buyuk shaxslaridan biridir.Uning she'rlari,ruboiylari o‘z vaqtida va hozir ham sevib oqilmoqda.U haqida o‘zbek xalq yozuvchisi Pirimqul Qodirov ‘‘Yulduzli tunlar’’asarini yozgan.Bu asar aynan Boburning yoshligidan to vafot etgunga qadar voqealirini o‘z ichiga qamrab oladi.","https://firebasestorage.googleapis.com/v0/b/forefather-a18bf.appspot.com/o/zahiriddin.jpg?alt=media&token=1eb7519e-c3c4-41cf-bca9-efe58f3aac91","https://uz.wikipedia.org/wiki/Bobur"));
        scientists.add(new Scientist("Umar Xayyom (1048-1131)","Umar Xayyom ilmda ham, ijodda ham oʻzini shayx urrais Abu Ali ibn Sinoning hassos va sadoqatli shogirdi hisoblagan. Ibn Sino asarlarini tushunmagan kishilar ularni izohlash va sharhlashni undan soʻraganlar. U ustozining bir qator asarlarini arabchadan forschaga tarjima qilib, sharhlab bergan, uning gʻoya va qarashlarini davom ettirgan hamda targʻib qilgan.","https://firebasestorage.googleapis.com/v0/b/forefather-a18bf.appspot.com/o/umar_xayyom.jpg?alt=media&token=de7f6d13-e35d-4b5c-82e4-a788408113a4","https://uz.wikipedia.org/wiki/Umar_Xayyom"));
        scientists.add(new Scientist("Abdulhamid Sulaymon o'g'li " +
                "Cho'lpon (1897-1938)","Jadidlarga qarshi boshlangan kompaniya Choʻlponni ham chetlab oʻtmaydi. Taʼqib va tazyiqlarga qaramay, u qizgʻin ijodiy faoliyat bilan shugʻullanadi. 30-yillarning boshida yana Moskvaga ketgan va SSSR Markaziy Ijroiya Komitetida tarjimon boʻlib ishlagan. Choʻlpon 1937-yil 14-iyulda qamoqqa olinadi va 1938-yil 4-oktyabrda Toshkentda Boʻzsuv boʻyida qatl etiladi.","https://firebasestorage.googleapis.com/v0/b/forefather-a18bf.appspot.com/o/cholpon.jpg?alt=media&token=cc5e90b0-111f-4a5f-9381-ae5ceb662005","https://uz.wikipedia.org/wiki/Abdulhamid_Cho%CA%BBlpon"));





        ScientistItemClick scientistItemClick = new ScientistItemClick() {
            @Override
            public void OnClick(Scientist scientist) {
                Intent intent  = new Intent(MainActivity.this , ListenerActivity.class);
                intent.putExtra("scientist",scientist.urlMore);
                startActivity(intent);



            }
        };

        ScientistRecyclerAdapter adapter = new ScientistRecyclerAdapter(scientists,scientistItemClick);

        recyclerView.setAdapter(adapter);

    }
}