package com.example.playlistiterator.iterator;

import com.example.playlistiterator.model.Song;

import java.util.List;

public class ReversePlaylistIterator implements SongIterator {
    private final List<Song> songs;
    private int position;

    public ReversePlaylistIterator(List<Song> songs) {
        this.songs = songs;
        this.position = songs.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return position >= 0;
    }

    @Override
    public Song next() {
        return songs.get(position--);
    }
}
