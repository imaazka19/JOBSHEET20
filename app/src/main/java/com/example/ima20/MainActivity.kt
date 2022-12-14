package com.example.ima20

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Kelas>()
    val listNama = arrayOf(

        "FIFIT SHOLIKHATUL MUFALAH",
        "FIKA ISMATUL HAWA",
        "FIKI ZULKARNAIN",
        "HEYDARISTO ZHAHIR RAZAK",
        "IKHA NUR ROCHAYATIN",
        "IMA AZKA ROSADAH",
        "KHAMILA NUR LUTFI AZZAHRA",
        "LAILATUL RISA ISTIFADHOH",
        "LUK LUUL LATIFAH",
        "MAULANA ZAHRONY",
        "MAYA INDAH LESTARI",
    )

    val listNis = arrayOf(
        "2989",
        "2990",
        "2991",
        "2996",
        "2998",
        "2999",
        "3001",
        "3004",
        "3006",
        "3007",
        "3009",
    )
    lateinit var kelasView: RecyclerView
    lateinit var kelasAdapter: KelasAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kelasView = findViewById(R.id.kelasView)
        kelasView.layoutManager = LinearLayoutManager(this)

        for (i in listNama.indices) {
            list.add(Kelas(listNama[i],listNis[i]))
        }

        kelasAdapter = KelasAdapter(list)
        kelasAdapter.notifyDataSetChanged()
        kelasView.adapter = kelasAdapter
    }
}