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
 * Created by rajanmaurya on 30/4/15.
 */
public class DFAACtivity extends Fragment {
        private TextView textView;

        public static DFAACtivity getInstance(int position) {
            DFAACtivity myFragment = new DFAACtivity();
            Bundle args = new Bundle();
            args.putInt("position", position);
            myFragment.setArguments(args);
            return myFragment;
        }


        private RecyclerView mRecyclerView;
        private RecyclerView.LayoutManager mLayoutManager ;
        protected RecyclerViewAdapter mAdapter;

        private int icon [] = {R.drawable.d1,R.drawable.d2,R.drawable.d3,R.drawable.d4,R.drawable.d5,R.drawable.d6,R.drawable.d7,R.drawable.d8,R.drawable.d9,R.drawable.d10,R.drawable.d11,R.drawable.d12,R.drawable.d13,R.drawable.d14,R.drawable.d15,R.drawable.d16,R.drawable.d17,R.drawable.d18,R.drawable.d19,R.drawable.d20,R.drawable.d21,R.drawable.d22,R.drawable.d23,R.drawable.d24,R.drawable.d25,R.drawable.d26,R.drawable.d27,R.drawable.d28,R.drawable.d29,R.drawable.d30};


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