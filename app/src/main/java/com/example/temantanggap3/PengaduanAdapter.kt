package com.example.temantanggap3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class PengaduanAdapter(
    private val pengaduanList: List<Pengaduan>
) : RecyclerView.Adapter<PengaduanAdapter.PengaduanViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PengaduanViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_card, parent, false)
        return PengaduanViewHolder(view)
    }

    override fun onBindViewHolder(holder: PengaduanViewHolder, position: Int) {
        val pengaduan = pengaduanList[position]
        holder.bind(pengaduan)
    }

    override fun getItemCount(): Int = pengaduanList.size

    inner class PengaduanViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val titleTextView: TextView = itemView.findViewById(R.id.itemTitle)
        private val statusTextView: TextView = itemView.findViewById(R.id.itemStatus)

        fun bind(pengaduan: Pengaduan) {
            titleTextView.text = pengaduan.title
            statusTextView.text = pengaduan.status

            val statusColor = when (pengaduan.status) {
                "Diterima" -> R.color.successColor
                "Diproses" -> R.color.oranye
                "Ditolak" -> R.color.red
                else -> R.color.black
            }
            statusTextView.setBackgroundColor(
                ContextCompat.getColor(itemView.context, statusColor)
            )
        }
    }
}