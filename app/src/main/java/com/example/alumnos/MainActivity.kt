package com.example.superherolist2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.alumnos.Alumno
import com.example.alumnos.RecyclerAdapter

class MainActivity : AppCompatActivity() {
    lateinit var mRecyclerView : RecyclerView
    val mAdapter : RecyclerAdapter = RecyclerAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpRecyclerView()

    }
    fun setUpRecyclerView(){
        mRecyclerView = findViewById(R.id.rvSuperheroList) as RecyclerView
        mRecyclerView.setHasFixedSize(true)
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        mAdapter.RecyclerAdapter(getAlumnos(), this)
        mRecyclerView.adapter = mAdapter
    }
    fun getAlumnos(): MutableList<Alumno>{
        var Alumnos:MutableList<Alumno> = ArrayList()
        Alumnos.add(Alumno("Elianeth Aragon", "Ing. Informatica", "Septimo Semestre", "https://avatars.githubusercontent.com/u/83630404?v=4"))
        Alumnos.add(Alumno("Patricia Eugenio", "Ing. Informatica", "Septimo Semestre", "https://avatars.githubusercontent.com/u/126405184?v=4"))
        Alumnos.add(Alumno("Iris samahi", "Ing. Informatica", "Septimo Semestre", "https://scontent.fpbc2-3.fna.fbcdn.net/v/t39.30808-6/315898932_748109633403180_8212964551482101847_n.jpg?_nc_cat=104&ccb=1-7&_nc_sid=5f2048&_nc_ohc=8XYuoim_ALwAX8VVqkj&_nc_ht=scontent.fpbc2-3.fna&oh=00_AfCvrkHk85Z1SqDp4vtTWkLGVbLtWOM9AdyffrDcMV7hEw&oe=656ABCE0"))
        Alumnos.add(Alumno("Dafene enriquez", "Ing. Informatica", "Septimo Semestre", "https://media-qro1-1.cdn.whatsapp.net/v/t61.24694-24/348461538_779992866950410_6976072813531217335_n.jpg?ccb=11-4&oh=01_AdTkqeo6zFM0BOOErMDzfsOCQAIh4WWBk324Jqd4dgrnmg&oe=656D6261&_nc_sid=e6ed6c&_nc_cat=107"))
        Alumnos.add(Alumno("Leticia cortez", "Ing. Informatica", "Septimo Semestre", "https://scontent.fpbc2-1.fna.fbcdn.net/v/t39.30808-6/283353570_1344970402691753_7592748992617578154_n.jpg?_nc_cat=103&ccb=1-7&_nc_sid=5f2048&_nc_ohc=QkgTR34CDlYAX_6Aky0&_nc_ht=scontent.fpbc2-1.fna&oh=00_AfBlaRXo2fsQTwS_FAgrxLKO9t-aTQAHRlyAsDGZPPITTQ&oe=6569F5A3"))
        Alumnos.add(Alumno("Abilene Guadalupe", "Ing. Informatica", "Septimo Semestre", "https://avatars.githubusercontent.com/u/103398709?v=4"))
        Alumnos.add(Alumno("Antonio Rosas", "Ing. Informatica", "Septimo Semestre", "https://media-qro1-1.cdn.whatsapp.net/v/t61.24694-24/370360045_631765505795118_7712795939131229154_n.jpg?ccb=11-4&oh=01_AdQrLQ0-0zH6ZQCYn2GpryJEBMiar47podTLix636328gw&oe=656D652D&_nc_sid=e6ed6c&_nc_cat=107"))
        Alumnos.add(Alumno("Gael Cuevas", "Ing. Informatica", "Septimo Semestre", "https://media-qro1-1.cdn.whatsapp.net/v/t61.24694-24/328129296_913448437161622_5867411636796553881_n.jpg?ccb=11-4&oh=01_AdRC1RIM_EOCoq5NkI_GFXvKvv6vCh9okoKArICbMt_Hug&oe=656D3F4B&_nc_sid=e6ed6c&_nc_cat=106"))
        Alumnos.add(Alumno("Kevin Arango", "Ing. Informatica", "Septimo Semestre", "https://avatars.githubusercontent.com/u/93015333?v=4"))
        Alumnos.add(Alumno("Genaro Martinez", "Ing. Informatica", "Septimo Semestre", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQW82muBGLoH65zGWqbXs0FUPxO-X3bnSxKtA&usqp=CAU"))
        Alumnos.add(Alumno("Jhair ", "Ing. Informatica", "Septimo Semestre", "https://media-qro1-1.cdn.whatsapp.net/v/t61.24694-24/370336573_618034710512288_1787115167721015599_n.jpg?ccb=11-4&oh=01_AdR4VdVP3LqqgiE6rE3AjaNFIDjGoDtkQUm0sNi0z0Dnjw&oe=656D49BA&_nc_sid=e6ed6c&_nc_cat=104"))
        Alumnos.add(Alumno("Andres Mendoza", "Ing. Informatica", "Septimo Semestre", "https://scontent.fpbc2-1.fna.fbcdn.net/v/t39.30808-1/365724201_1621376008354260_5836457097681550781_n.jpg?stp=dst-jpg_p320x320&_nc_cat=106&ccb=1-7&_nc_sid=5f2048&_nc_ohc=UJQwYlqH6HAAX9VidhL&_nc_ht=scontent.fpbc2-1.fna&oh=00_AfCs7JcjYXLcyBSwqB_-pJhioSGgWKstTWxtiYqvVXCsvQ&oe=6569D1CD"))

        return Alumnos
    }

}

