package com.vote.backend.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Record {
    private Integer id;
    private Integer userId;
    private Integer voteId;
}
