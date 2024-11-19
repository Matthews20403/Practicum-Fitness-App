package com.example.trackingapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


data class Activity(val Day: String, val Morning: String, val Afternoon: String, val Running: String)


class ExamAdapterClass (private val Activities: List<Activity>) : RecyclerView.Adapter<ExamAdapterClass.viewHolder>()
{
    class viewHolder(view: View): RecyclerView.ViewHolder(view)
    {
       val Day : TextView = view.findViewById(R.id.txtDay)
        val Morning: TextView = view.findViewById(R.id.txtMorning)
        val Afternoon: TextView = view.findViewById(R.id.txtNoon)
        val Running: TextView = view.findViewById(R.id.txtRunning)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.detailed_view, parent, false)
        return viewHolder(view)
    }

    override fun getItemCount(): Int = Activities.size

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val Activity = Activities[position]

        holder.Day.text= Activity.Day
        holder.Morning.text= Activity.Morning
        holder.Afternoon.text= Activity.Afternoon
        holder.Running.text = Activity.Running

    }


}
