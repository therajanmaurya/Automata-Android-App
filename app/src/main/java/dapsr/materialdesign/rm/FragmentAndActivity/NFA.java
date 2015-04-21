package dapsr.materialdesign.rm.FragmentAndActivity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import dapsr.materialdesign.rm.R;

/**
 * Created by rajanmaurya on 21/4/15.
 */
public class NFA extends Fragment {
    private TextView textView;

    public static NFA getInstance(int position) {
        NFA myFragment = new NFA();
        Bundle args = new Bundle();
        args.putInt("position", position);
        myFragment.setArguments(args);
        return myFragment;
    }


    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager ;
    protected RecyclerViewAdapter mAdapter;
    protected String[] mDataset;
    private static final int SPAN_COUNT = 2;
    private int icon [] = {R.drawable.dfa24,R.drawable.dfa25,R.drawable.dfa26,R.drawable.dfa27,R.drawable.dfa28,R.drawable.dfa29,R.drawable.dfa30,R.drawable.dfa31,R.drawable.dfa32,R.drawable.dfa33,R.drawable.dfa34,R.drawable.dfa35,R.drawable.dfa36,R.drawable.dfa37,R.drawable.dfa38,R.drawable.dfa39,R.drawable.dfa40,R.drawable.dfa41,R.drawable.dfa42,R.drawable.dfa43,R.drawable.dfa44,R.drawable.dfa45,R.drawable.dfa46,R.drawable.dfa47,R.drawable.dfa48,R.drawable.dfa49,R.drawable.dfa50,R.drawable.dfa51,R.drawable.dfa52,R.drawable.dfa53,R.drawable.dfa54,R.drawable.dfa55,R.drawable.dfa56,R.drawable.dfa57,R.drawable.dfa58,R.drawable.dfa59,R.drawable.dfa60,R.drawable.dfa61,R.drawable.dfa62,R.drawable.dfa63,R.drawable.dfa64,R.drawable.dfa65,R.drawable.dfa66,R.drawable.dfa67,R.drawable.dfa68,R.drawable.dfa69,R.drawable.dfa70,R.drawable.dfa71,R.drawable.dfa72,R.drawable.dfa73};

    private enum LayoutManagerType {
        GRID_LAYOUT_MANAGER,
        LINEAR_LAYOUT_MANAGER
    }

    Context context;

    protected LayoutManagerType mCurrentLayoutManagerType;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.dfa, container, false);

        mRecyclerView = (RecyclerView) layout.findViewById(R.id.recyclerView);

        //mRecyclerView.addItemDecoration(new SpacesItemDecoration(5));
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mCurrentLayoutManagerType = LayoutManagerType.LINEAR_LAYOUT_MANAGER;
        mRecyclerView.setLayoutManager(mLayoutManager);
        // mRecyclerView.scrollToPosition(scrollPosition);

        // specify an adapter (see also next example)
        mAdapter = new RecyclerViewAdapter(icon,context);
        // Set CustomAdapter as the adapter for RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        return layout;

    }



}