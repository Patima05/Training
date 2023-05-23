package com.yoga.training
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yoga.training.databinding.ItemTrainingTypeBinding

class TrainingTypesAdapter (private val types: List<TrainingType>): RecyclerView.Adapter<TrainingTypesAdapter.TypeHolder>(){
    class TypeHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val binding = ItemTrainingTypeBinding.bind(itemView)

        fun bind(type: TrainingType) = with(binding){
            img.setImageResource(type.img)
            typeName.text = type.name
            lessNum.text = type.lessonsNum.toString()
            level.text = type.level
            likes.text = type.likesNum
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TypeHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_training_type, parent, false)
        return TypeHolder(view)
    }

    override fun getItemCount(): Int {
        return types.size
    }

    override fun onBindViewHolder(holder: TypeHolder, position: Int) {
        holder.bind(types[position])
    }

}
