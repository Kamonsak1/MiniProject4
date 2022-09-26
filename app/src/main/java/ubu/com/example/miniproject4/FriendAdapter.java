package ubu.com.example.miniproject4;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import com.google.firebase.database.ValueEventListener;

import java.util.List;

public class FriendAdapter extends RecyclerView.Adapter<FriendAdapter.ViewHolder> {
    private Context context;
    private List<Friend>friends;
    private ValueEventListener valueEventListener;

    public FriendAdapter(List<Friend>friends,Context context){
        this.friends = friends;
        this.context = context;
    }
    @Override
    public FriendAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_food,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder,int position){
        Friend upload = friends.get(position);
        holder.textViewName.setText(upload.getFriend_Name());
        Glide.with(context).load(upload.getUrl()).into(holder.imageView);
    }
    @Override
    public int getItemCount() {
        return friends.size();
    }
    class  ViewHolder extends RecyclerView.ViewHolder{
        public TextView textViewName;
        public ImageView imageView;

        public  ViewHolder(View itemView){
            super(itemView);

            textViewName = itemView.findViewById(R.id.name);
            imageView = itemView.findViewById(R.id.icon);
        }

    }
}
