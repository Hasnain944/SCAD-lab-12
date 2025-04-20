package com.example.playlistiterator.iterator;

import com.example.playlistiterator.model.Song;

public interface SongIterator {
    boolean hasNext();
    Song next();
}
