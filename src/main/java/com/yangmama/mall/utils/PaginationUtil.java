package com.yangmama.mall.utils;

import lombok.extern.slf4j.Slf4j;
import okhttp3.Headers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Pagination util
 * @author peter ma
 */
@Slf4j
public class PaginationUtil {
    private static final String NEXT_PAGE_FLAG = "rel=\"next\"";

    public static Optional<String> getNextPageUrl(Headers headers) {
        Map<String, List<String>> multimap = headers.toMultimap();
        List<String> links = multimap.getOrDefault("link", new ArrayList<>());
        log.info(links.toString());
        for (String link : links) {
            String[] ls = link.split(",");
            for (String l : ls) {
                String[] linkArr = l.trim().split(";");
                String linkUrl = linkArr[0].trim().substring(1, linkArr[0].length() - 1);
                String flag = linkArr[1].trim();
                if (NEXT_PAGE_FLAG.equals(flag)) {
                    return Optional.of(linkUrl);
                }
            }
        }
        return Optional.empty();
    }
}
