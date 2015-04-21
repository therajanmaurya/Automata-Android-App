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
public class MealyAndMoore extends Fragment {
    private TextView textView;

    public static MealyAndMoore getInstance(int position) {
        MealyAndMoore myFragment = new MealyAndMoore();
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
    private int icon [] = {R.drawable.mm1,R.drawable.mm2,R.drawable.mm3,R.drawable.mm4,R.drawable.mm5,R.drawable.mm6};

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