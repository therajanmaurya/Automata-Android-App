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
 * Created by rajanmaurya on 20/4/15.
 */
public class DFA extends Fragment {
    private TextView textView;

    public static DFA getInstance(int position) {
        DFA myFragment = new DFA();
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
    private int icon [] = {R.drawable.dfa1,R.drawable.dfa2,R.drawable.dfa3,R.drawable.dfa4,R.drawable.dfa5,R.drawable.dfa6,R.drawable.dfa7,R.drawable.dfa8,R.drawable.dfa9,R.drawable.dfa10,R.drawable.dfa11,R.drawable.dfa12,R.drawable.dfa13,R.drawable.dfa14,R.drawable.dfa15,R.drawable.dfa16,R.drawable.dfa17,R.drawable.dfa18,R.drawable.dfa19,R.drawable.dfa20,R.drawable.dfa21,R.drawable.dfa22,R.drawable.dfa23};

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