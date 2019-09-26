package com.route.notesapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.route.database.model.Note;

import java.util.List;

/**
 * Created by Mohamed Nabil Mohamed on 9/26/2019.
 * m.nabil.fci2015@gmail.com
 */
public class NotesRecyclerAdapter extends RecyclerView.Adapter<NotesRecyclerAdapter.ViewHolder> {

    List<Note> noteList;

    public NotesRecyclerAdapter(List<Note> noteList) {
        this.noteList = noteList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_note,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Note note=noteList.get(position);
        holder.title.setText(note.getTitle());
        holder.time.setText(note.getTime());
    }

    @Override
    public int getItemCount() {
        if(noteList==null)
            return 0;
        return noteList.size();
    }

    public void changeList(List<Note> notes){
        this.noteList=notes;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        TextView time;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            time = itemView.findViewById(R.id.time);
            title =itemView.findViewById(R.id.title);
        }
    }
}
