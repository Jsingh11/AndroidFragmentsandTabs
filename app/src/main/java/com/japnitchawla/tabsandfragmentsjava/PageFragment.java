package com.japnitchawla.tabsandfragmentsjava;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class PageFragment extends Fragment {

    private static final String CONTENT_KEY = "content_arg_key";

    // TODO Declare member variables
    private String mContent;

    // TODO Public static factory method newInstance()
    public static PageFragment newInstance(String content) {
        Bundle args = new Bundle();
        args.putString(CONTENT_KEY, content);

        PageFragment fragment = new PageFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO Init/store member variables
        mContent = getArguments().getString(CONTENT_KEY);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,  @Nullable Bundle savedInstanceState) {
        // TODO create the bind views
        View rootView = inflater.inflate(R.layout.page_fragment, container, false);
        TextView textView = rootView.findViewById(R.id.page_content);
        textView.setText(mContent);
        return rootView;
    }
}
