package vip.zhonglunsheng.openfeign.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class KmContent {

    @JsonProperty("code")
    private Integer code;
    @JsonProperty("message")
    private String message;
    @JsonProperty("data")
    private DataDTO data;

    @NoArgsConstructor
    @Data
    public static class DataDTO {
        @JsonProperty("records")
        private List<RecordsDTO> records;
        @JsonProperty("total")
        private Integer total;
        @JsonProperty("size")
        private Integer size;
        @JsonProperty("current")
        private Integer current;
        @JsonProperty("orders")
        private List<?> orders;
        @JsonProperty("optimizeCountSql")
        private Boolean optimizeCountSql;
        @JsonProperty("searchCount")
        private Boolean searchCount;
        @JsonProperty("countId")
        private Object countId;
        @JsonProperty("maxLimit")
        private Object maxLimit;
        @JsonProperty("pages")
        private Integer pages;

        @NoArgsConstructor
        @Data
        public static class RecordsDTO {
            @JsonProperty("id")
            private Integer id;
            @JsonProperty("title")
            private String title;
            @JsonProperty("content")
            private String content;
            @JsonProperty("mastery")
            private Integer mastery;
            @JsonProperty("summary")
            private Object summary;
            @JsonProperty("recall")
            private Object recall;
            @JsonProperty("score")
            private Integer score;
            @JsonProperty("createTime")
            private String createTime;
            @JsonProperty("updateTime")
            private String updateTime;
            @JsonProperty("tags")
            private String tags;
            @JsonProperty("source")
            private String source;
            @JsonProperty("flag")
            private Integer flag;
            @JsonProperty("reviewStatus")
            private Boolean reviewStatus;
            @JsonProperty("reviewLogs")
            private Object reviewLogs;
            @JsonProperty("reviewSchedules")
            private Object reviewSchedules;
        }
    }
}
