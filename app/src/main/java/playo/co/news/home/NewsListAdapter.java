package playo.co.news.home;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import playo.co.news.R;
import playo.co.news.entity.Hit;

/**
 * Created by Divum on 15-10-2017.
 */

public class NewsListAdapter extends RecyclerView.Adapter<NewsListAdapter.ViewHolder> {

    private List<Hit> hitList;
    private Context mContext;

    public NewsListAdapter(List<Hit> hitList, Context mContext) {
        this.hitList = hitList;
        this.mContext = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = null;
        view = inflater.inflate(R.layout.news_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.itemName.setText(hitList.get(position).getTitle());
        holder.subText.setText(hitList.get(position).getStoryText());
        holder.itemMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(hitList.get(position).getUrl()));
                mContext.startActivity(browserIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return hitList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private View itemMain;
        private TextView itemName,subText,madeItCount,Time;


        public ViewHolder(View itemView) {
            super(itemView);
            itemMain = itemView;
            itemName=(TextView) itemView.findViewById(R.id.name);
            subText = (TextView)itemView.findViewById(R.id.subname);

        }
    }
}
