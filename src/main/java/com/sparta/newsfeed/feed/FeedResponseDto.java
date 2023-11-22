package com.sparta.newsfeed.feed;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FeedResponseDto {
    private String title;
    private String contents;

    public FeedResponseDto(Feed feed) {
        this.title = feed.getTitle();
        this.contents = feed.getContents();
    }
}
