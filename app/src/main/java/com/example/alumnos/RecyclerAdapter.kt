package com.example.alumnos

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.superherolist2.R
import com.squareup.picasso.Picasso

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    var Alumnos: MutableList<Alumno>  = ArrayList()
    lateinit var context:Context

    fun RecyclerAdapter(superheros : MutableList<Alumno>, context: Context){
        this.Alumnos = superheros
        this.context = context
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = Alumnos.get(position)
        holder.bind(item, context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_alumno_list, parent, false))
    }

    override fun getItemCount(): Int {
        return Alumnos.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val AlumnoName = view.findViewById(R.id.tvAlumno) as TextView
        val carrera = view.findViewById(R.id.tvRealName) as TextView
        val semestre = view.findViewById(R.id.tvPublisher) as TextView
        val avatar = view.findViewById(R.id.ivAvatar) as ImageView

        fun bind(Alumno:Alumno, context: Context){
            AlumnoName.text = Alumno.nombre
            carrera.text = Alumno.carrera
            semestre.text = Alumno.semestre
            avatar.loadUrl(Alumno.photo)
            itemView.setOnClickListener(View.OnClickListener { Toast.makeText(context, Alumno.nombre, Toast.LENGTH_SHORT).show() })
        }
        fun ImageView.loadUrl(url: String) {
            Picasso.with(context).load(url).into(this)
        }
    }
}