package com.example.galleryapp

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter (val views: ArrayList<ImageView>): RecyclerView.Adapter<ImageAdapter.ViewHolder>() {
    class ViewHolder {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount() = views.size
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: ImageAdapter.ViewHolder, position: Int) {
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
