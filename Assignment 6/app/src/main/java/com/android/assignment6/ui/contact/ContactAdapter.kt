package com.android.assignment6.ui.contact

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.assignment6.R

class ContactAdapter(var contacts: ArrayList<Contact>) :
    RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ContactAdapter.ContactViewHolder {
        // parent --> RecyclerView UI, is a ViewGroup
        // false, already we attached to parent.context, simply false
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.contact_item_list, parent, false)
        return ContactViewHolder(view)
    }
    /* Sets the contents of an item at a given position in the RecyclerView.
    Called by RecyclerView to display the data at a specified position over and over.
   */

    override fun onBindViewHolder(holder: ContactAdapter.ContactViewHolder, position: Int) {
        holder.link.text = contacts[position].link
        holder.description.text = contacts[position].description

        holder.link.setBackgroundColor(Color.TRANSPARENT)

        holder.description.setBackgroundColor(Color.TRANSPARENT)

        holder.icon.setImageResource(contacts[position].imageId)

    }

    override fun getItemCount() = contacts.size

    inner class ContactViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var link: TextView = itemView.findViewById(R.id.tv_link)
        var description: TextView = itemView.findViewById(R.id.tv_description)
        var icon: ImageView = itemView.findViewById(R.id.iv_icon)
    }
}