package com.example.playlistiterator.controller;

import com.example.playlistiterator.model.Song;
import com.example.playlistiterator.iterator.SongIterator;
import com.example.playlistiterator.playlist.Playlist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/playlist")
public class PlaylistController {

    @Autowired private Playlist playlist;

    @PostMapping("/add")
    public String addSong(@RequestParam String title, @RequestParam String artist) {
        playlist.addSong(new Song(title, artist));
        return "Song added!";
    }

    @GetMapping("/forward")
    public List<String> playForward() {
        List<String> result = new ArrayList<>();
        SongIterator iterator = playlist.iterator();
        while (iterator.hasNext()) {
            result.add(iterator.next().toString());
        }
        return result;
    }

    @GetMapping("/reverse")
    public List<String> playReverse() {
        List<String> result = new ArrayList<>();
        SongIterator iterator = playlist.reverseIterator();
        while (iterator.hasNext()) {
            result.add(iterator.next().toString());
        }
        return result;
    }
}
