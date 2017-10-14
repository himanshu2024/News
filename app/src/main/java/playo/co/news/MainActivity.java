package playo.co.news;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import okhttp3.internal.framed.ErrorCode;
import playo.co.news.entity.NewsData;
import playo.co.news.home.NewsContract;
import playo.co.news.home.NewsListAdapter;
import playo.co.news.home.NewsPresenter;

public class MainActivity extends AppCompatActivity implements NewsContract.NewsView {

    private RecyclerView mRecyclerView;
    private ProgressBar mProgressBar;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.list);
        mProgressBar = (ProgressBar) findViewById(R.id.load);
        mTextView = (TextView) findViewById(R.id.msg);

        mRecyclerView.setVisibility(View.GONE);
        mProgressBar.setVisibility(View.VISIBLE);
        mTextView.setVisibility(View.GONE);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);


        NewsPresenter newsPresenter = new NewsPresenter(this);
        newsPresenter.getNewsData();
    }

    @Override
    public void noInterNet() {

    }

    @Override
    public void onSuccess(NewsData newsData) {
        mRecyclerView.setVisibility(View.VISIBLE);
        mProgressBar.setVisibility(View.GONE);
        mTextView.setVisibility(View.GONE);

        NewsListAdapter adapter = new NewsListAdapter(newsData.getHits(),this);
        mRecyclerView.setAdapter(adapter);
    }

    @Override
    public void onFailure(String errorMsg, ErrorCode errorCode) {
        mRecyclerView.setVisibility(View.GONE);
        mProgressBar.setVisibility(View.GONE);
        mTextView.setVisibility(View.VISIBLE);
        mTextView.setText(errorMsg);
    }

    @Override
    public void onNoItem() {
        mRecyclerView.setVisibility(View.GONE);
        mProgressBar.setVisibility(View.GONE);
        mTextView.setVisibility(View.VISIBLE);
        mTextView.setText("News Not Found");
    }
}
