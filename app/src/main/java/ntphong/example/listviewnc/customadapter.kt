package ntphong.example.listviewnc

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class customadapter (var context : Context, var mangmonann: ArrayList<monan>) : BaseAdapter() {
    class viewHoler (row :View){
        var textviewtenmonan :TextView
        var imagetenmonan :ImageView
        init {
            textviewtenmonan =row.findViewById(R.id.txtmonan)
            imagetenmonan=row.findViewById(R.id.imgmonan)
        }
    }
    override fun getItem(position: Int): Any {
        return mangmonann.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return mangmonann.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        var view : View?
        var viewholder : viewHoler
        if(convertView == null){
            var layoutinflater : LayoutInflater = LayoutInflater.from(context)
            view = layoutinflater.inflate(R.layout.dongmonan,null)
            viewholder = viewHoler(view)
            view.tag = viewholder

        }
        else{
            view = convertView
            viewholder= convertView.tag as viewHoler
        }
        var monann : monan = getItem(position) as monan
        viewholder.textviewtenmonan.text= monann.ten
        viewholder.imagetenmonan.setImageResource(monann.hinh)
        return view
    }
}