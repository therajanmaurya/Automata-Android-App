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

public class REAndConversion  extends Fragment {
    private TextView textView;

    public static REAndConversion  getInstance(int position) {
        REAndConversion  myFragment = new REAndConversion ();
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
    private int icon [] = {R.drawable.re1,R.drawable.re2,R.drawable.re3,R.drawable.re4,R.drawable.re5,R.drawable.re6,R.drawable.re7,R.drawable.re8,R.drawable.re9,R.drawable.re10,R.drawable.re11,R.drawable.re12,R.drawable.re13,R.drawable.re14,R.drawable.re15,R.drawable.re16,R.drawable.re17,R.drawable.re18,R.drawable.re19,R.drawable.re20,R.drawable.re21,R.drawable.re22,R.drawable.re23,R.drawable.re24,R.drawable.re25,R.drawable.re26,R.drawable.re27,R.drawable.re28,R.drawable.re29,R.drawable.re30,R.drawable.re31,R.drawable.re32 };

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