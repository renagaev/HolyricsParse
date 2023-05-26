package com.limagiran.holyrics.model;
import com.limagiran.enums.EnumSongKey.EnumSongKey;
import com.limagiran.enums.EnumSongTimeSig.EnumSongTimeSig;
import com.limagiran.holyrics.midi.MidiCodeVelocityItem.MidiCodeVelocityItem;
import com.limagiran.holyrics.pojo.TranslationItem.TranslationItem;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Music implements Serializable {
    public static final long serialVersionUID = 12491L;
    public long id;
    public String artist;
    public String title;
    public String lyrics;
    public List<Integer> order;
    public String note;
    public String language;
    public String formatting;
    public transient String[] formats;
    public long set;
    public transient String vagalumeLink;
    public transient int paragraphLength;
    public transient String titleToOrder;
    public transient String artistToOrder;
    public String titleToSearch;
    public String artistToSearch;
    public String lyricsToSearch;
    public String noteToSearch;
    public String lyricsHTML;
    public String titleHTML;
    public String artistHTML;
    public transient boolean fixStringsToSearch;
    public String author;
    public String src;
    public Integer numIni;
    public String[][] translations;
    public transient TranslationItem<String[]>[] translationsObj;
    public boolean archived;
    public long modifiedTime;
    public transient String[] paragraphsCache;
    public String midi;
    public transient MidiCodeVelocityItem midiCache;
    public String[] strParams;
    public transient Double bpm;
    public transient EnumSongTimeSig timeSig;
    public transient EnumSongKey songKey;
    public transient Integer holyricsSongID;
    public transient String copyright;
    public transient Map customParam;
    public transient Set<String> customParamKeys;
    public long version;
}