package com.sujit.api.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class PaginatedBookResponse {
    private List<Book> bookList;
    private Long numberOfItems;
    private int numberOfPages;
}
