package com.example.playlistiterator.playlist;
import com.example.playlistiterator.model.Song;
import com.example.playlistiterator.iterator.PlaylistIterator;
import com.example.playlistiterator.iterator.ReversePlaylistIterator;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
@Component
public class Playlist {
    private final List<Song> songs = new ArrayList<>();
    public void addSong(Song song) {
        songs.add(song);
    }
    public PlaylistIterator iterator() {
        return new PlaylistIterator(songs);
    }
    public ReversePlaylistIterator reverseIterator() {
        return new ReversePlaylistIterator(songs);
    }
    public List<Song> getSongs() {
        return songs;
    }
}
