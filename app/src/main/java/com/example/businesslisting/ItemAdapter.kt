package com.example.businesslisting

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(
    private val context: Context,
    private val dataset: List<ItemDataModel>
): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val textViewTitle: TextView = view.findViewById(R.id.title_text)
        val textViewSecondary: TextView = view.findViewById(R.id.secondary_text)
        val textViewSupporting: TextView = view.findViewById(R.id.supporting_text)
        val imageView: ImageView = view.findViewById(R.id.business_image)
    }

    /**
     *  new views (invoked by the layout manager)
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.cardlayout, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    /**
     * Replacing the contents of a view (invoked by the layout manager)
     */

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val item = dataset[position]
        holder.textViewTitle.text = context.resources.getString(item.card_title_text)
        holder.textViewSecondary.text = context.resources.getString(item.card_secondary_text)
        holder.textViewSupporting.text = context.resources.getString(item.card_supporting_text)
        holder.imageView.setImageResource(item.card_image)

    }

    /**
     * Returning the size of your dataset (invoked by the layout manager)
     */
    override fun getItemCount() = dataset.size
}