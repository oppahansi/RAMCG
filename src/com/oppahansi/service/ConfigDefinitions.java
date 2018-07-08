package com.oppahansi.service;

public class ConfigDefinitions {
    public static final String RuleSeperator = "---";
    public static final String CommentPrefix = "# ";
    public static final String Indent = "    ";
    public static final String ReversedPrefix = "~";

    public enum SubmissionType {
        ID("id"),
        ANY("any"),
        SUNMISSION("submission"),
        COMMENT("comment"),
        TEXT("text submission"),
        LINK("link submission"),
        CROSSPOST("crosspost submission")
        ;

        private final String text;

        SubmissionType(final String text) {
            this.text = text;
        }

        public String toString() {
            return text;
        }
    }

    public enum SearchChecks {
        ID("id"),
        TITLE("title"),
        DOMAIN("domain"),
        URL("url"),
        BODY("body"),
        FLAIR_TEXT("flait_text"),
        FLAIR_CSS("flair_css_class"),
        /* Crossposts only */
        CROSS_POST_ID("crosspost_id"),
        CROSSPOST_TITLE("crosspost_title")
        ;

        private final String text;

        SearchChecks(final String text) {
            this.text = text;
        }

        public String toString() {
            return text;
        }
    }

    public enum CheckSubGroups {
        AUTHOR("author"),
        CROSSPOST_AUTHOR("crosspost_author"),
        CROSSPOST_SUBREDDIT("crosspost_subreddit"),
        /* Comments only */
        PARENT_SUBMISSION("parent_submission")
        ;
        private final String text;

        CheckSubGroups(final String text) {
            this.text = text;
        }

        public String toString() {
            return text;
        }
    }

    public enum MediaChecks {
        AUTHOR("media_author"),
        AUTHOR_URL("media_author_url"),
        TITLE("media_title"),
        DESCRIPTION("media_description"),
        /* Comments only */
        COMMENT_ID("id"),
        COMMENT_BODY("body"),
        /* Users inside author or crosspost_author sub-group */
        USER_ID("id"),
        USER_NAME("name"),
        USER_FLAIR_TEXT("flair_text"),
        USER_CSS_CLASS("flair_css_class"),
        /* Subreddits inside crosspost_subreddit */
        SUBREDDIT_NAME("name")
        ;

        private final String text;

        MediaChecks(final String text) {
            this.text = text;
        }

        public String toString() {
            return text;
        }
    }

    public enum MathcingModifiers {
        INCLUDES_WORD("includes-word"),
        INCLUDES("includes"),
        STARTS_WITH("starts-with"),
        ENDS_WITH("ends-with"),
        FULL_EXACT("full-exact"),
        FULL_TEXT("full-text"),
        REGEX("regex"),
        CASE_SENSITIVE("case-sensitive")
        ;

        private final String text;

        MathcingModifiers(final String text) {
            this.text = text;
        }

        public String toString() {
            return text;
        }
    }

    public enum NonSearchingChecks {
        /* Submissions & Comments*/
        REPORTS("reports"),
        BODY_LONGER_THAN("body_longer_than"),
        BODY_SHORTER_THAN("body_shorter_than"),
        IS_EDITED("is_edited"),
        /* Submission only */
        IS_ORIGINAL_CONTENT("is_original_content"),
        /* Comment only */
        IS_TOP_LEVEL("is_top_level"),
        /* Subreddits only */
        IS_NSFW("is_nsfw"),
        /* Karma */
        COMMENT_KARMA("comment_karma"),
        POST_KARMA("post_karma"),
        COMBINED_KARMA("combined_karma"),
        /* Account age */
        ACCOUNT_AGE("account_age"),
        /* Other */
        IS_GOLD("is_gold"),
        IS_SUBMITTER("is_submitter"),
        IS_CONTRIBUTER("is_contributor"),
        IS_MODERATOR("is_moderator"),
        ;

        private final String text;

        NonSearchingChecks(final String text) {
            this.text = text;
        }

        public String toString() {
            return text;
        }
    }

    public enum MiscSettings {
        MODERATORS_EXEMPT("moderators_exempt"),
        PRIORITY("priority"),
        SATISFY_ANY_THRESHOLD("satisfy_any_threshold"),
        COMMENT("comment"),
        COMMENT_STICKIED("comment_stickied"),
        MODMAIL("modmail"),
        MODMAIL_SUBJECT("modmail_subject"),
        MESSAGE("message"),
        MESSAGE_SUBJECT("message_subject"),

        ACTION_REASON("action_reason"),


        ;

        private final String text;

        MiscSettings(final String text) {
            this.text = text;
        }

        public String toString() {
            return text;
        }
    }

    public enum ActionType {
        /* Submisisons base item or parent_submission sub-group */
        KEY_WORD("action"),
        APPROVE("approve"),
        REMOVE("remove"),
        SPAM("spam"),
        FILTER("filter"),
        REPORT("report"),
        SET_FLAIR("set_flair"),
        SET_STICKY("set_sticky"),
        SET_NSFW("set_nsfw"),
        SET_SPOILER("set_spoiler"),
        SET_CONTEST_MODE("set_contest_mode"),
        SET_ORIGINAL_CONTENT("set_original_content"),
        SET_SUGGESTED_SORT("set_suggested_sort"),
        SET_LOCKED("set_locked"),
        OVERWRITE_FLAIR("overwrite_flair"),
        /* Comments */
        COMMENT_ACTION("action"),
        REPORT_REASON("report_reason"),
        /* User */
        USER_SET_FLAIR("set_flair"),
        USER_OVERWRITE_FLAIR("overwrite_flair"),
        ;

        private final String text;

        ActionType(final String text) {
            this.text = text;
        }

        public String toString() {
            return text;
        }
    }

    public enum OtherDirectives {
        IGNORE_BLOCKQUOTES("ignore_blockquotes")
        ;

        private final String text;

        OtherDirectives(final String text) {
            this.text = text;
        }

        public String toString() {
            return text;
        }
    }

    public enum PlaceHolders {
        AUTHOR("{{author}}"),
        AUTHOR_FLAIR_TEXT("{{author_flair_text}}"),
        AUTHOR_FLAIR_CSS_CLASS("{{author_flair_css_class}}"),
        BODY("{{body}}"),
        PERMALINK("{{permalink}}"),
        SUBREDDIT("{{subreddit}}"),
        KIND("{{kind}}"),
        TITLE("{{title}}"),
        DOMAIN("{{domain}}"),
        URL("{{url}}"),
        MEDIA_AUTHOR("{{media_author}}"),
        MEDIA_AUTHOR_URL("{{media_author_url}}"),
        MEDIA_TITLE("{{media_title}}"),
        MEDIA_DESCRIPTION("{{media_description}}"),
        MATCH("{{match}}"),
        //MATCH_SPECIFIC_1("{{match-{0}}}")
        //MATCH_SPECIFIC_2("{{match-{0}-{1}}}")
        ;

        private final String text;

        PlaceHolders(final String text) {
            this.text = text;
        }

        public String toString() {
            return text;
        }
    }

    public enum StandartConditions {
        KEY_WORD("standard"),
        IMAGE_HOSTING_SITES("image hosting sites"),
        DIRECT_IMAGE_LINKS("direct image links"),
        VIDEO_HOSTING_SITES("video hosting sites"),
        STREAMING_SITES("streaming sites"),
        CROWDFUNDING_SITES("crowdfunding sites"),
        MEME_GENERATOR_SITES("meme generator sites"),
        FACEBOOK_LINKS("facebook links"),
        AMAZON_AFFILIATE_LINKS("amazon affiliate links")
        ;

        private final String text;

        StandartConditions(final String text) {
            this.text = text;
        }

        public String toString() {
            return text;
        }
    }
}
