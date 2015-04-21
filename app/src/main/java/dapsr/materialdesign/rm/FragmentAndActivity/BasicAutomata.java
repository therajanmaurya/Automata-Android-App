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
public class BasicAutomata extends Fragment {
    private TextView textView;

    public static BasicAutomata getInstance(int position) {
        BasicAutomata myFragment = new BasicAutomata();
        Bundle args = new Bundle();
        args.putInt("position", position);
        myFragment.setArguments(args);
        return myFragment;
    }


    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager ;
    protected RecyclerViewAdapter mAdapter;

    private int icon [] = {R.drawable.basic,R.drawable.basic2,R.drawable.basic3,R.drawable.basic4,R.drawable.basic5,R.drawable.basic6,R.drawable.basic7,R.drawable.basic8,R.drawable.basic9,R.drawable.basic10,R.drawable.basic11,R.drawable.basic12,R.drawable.basic13,R.drawable.basic14,R.drawable.basic15,R.drawable.basic16,R.drawable.basic17,R.drawable.basic18,R.drawable.basic19,R.drawable.basic20,R.drawable.basic21,R.drawable.basic22,R.drawable.basic23,R.drawable.basic24,R.drawable.basic25,R.drawable.basic27,R.drawable.basic28,R.drawable.basic29,R.drawable.basic30,R.drawable.basic31,R.drawable.basic32,R.drawable.basic33,R.drawable.basic34 };


    private enum LayoutManagerType {
        GRID_LAYOUT_MANAGER,
        LINEAR_LAYOUT_MANAGER
    }

    Context context;

    protected LayoutManagerType mCurrentLayoutManagerType;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.basicautomata, container, false);


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