package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.jay.wsd.screen44.R;

import java.util.ArrayList;

import model.Product_Model;

public class Gateorise_Adapter extends RecyclerView.Adapter<Gateorise_Adapter.ViewHolder> {

    Context context;
    ArrayList<Product_Model> product_models;

    public Gateorise_Adapter(Context context, ArrayList<Product_Model> product_models) {
        this.context = context;
        this.product_models = product_models;
    }

    @NonNull
    @Override
    public Gateorise_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Gateorise_Adapter.ViewHolder holder, int position) {

        holder.pic.setImageResource(product_models.get(position).getPic());
        holder.amount.setText(product_models.get(position).getAmount());
        holder.tv1.setText(product_models.get(position).getTv1());
        holder.tv2.setText(product_models.get(position).getTv2());
    }

    @Override
    public int getItemCount() {
        return product_models.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView pic;
        TextView amount,tv1,tv2;
        public ViewHolder(View itemView) {
            super(itemView);

            pic = itemView.findViewById(R.id.pic);
            amount = itemView.findViewById(R.id.amount);
            tv1 = itemView.findViewById(R.id.tv1);
            tv2 = itemView.findViewById(R.id.tv2);


        }
    }
}
