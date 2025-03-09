//import java.time.Instant
//import java.time.temporal.ChronoUnit
//
////Most liked video in 24h
////
////A website allows users to post their videos and to like other videos.
////
////Whenever a user posts a video, a new log entry is appended to the upload log file containing:
////
////id of the video
////
////id of the user
////
////timestamp
////
////Whenever a user likes a video, a new log entry is added to the like log file containing:
////
////id of the video that was liked
////
////id of the user that liked it
////
////timestamp
////
////This website has a main page that shows a single video.
//// It shows the video that received the highest number of likes in the 24h before the access to the main page.
////
////Given you have access to the logs, write a function that takes a timestamp as input and returns the video that should have been on the main page at this timestamp.
//
//data class Likes(val videoId: Int, val user: Int, val timestamp: Instant)
//
//
//class VideoLog() {
//    val likesLog = mutableListOf<Likes>()
//    val videoLog = mutableListOf<Likes>()
//
//    fun addLikes(like: Likes) {
//        if (videoLog.contains(like.videoId))
//        likesLog.add(like)
//    }
//
//    fun addVideo(like: Likes) {
//        videoLog.add(like)
//    }
//
//    fun mainPageVideo(timestamp: Instant): Int? {
//        val validVideos = likesLog.filter {
//            it.timestamp.isAfter(timestamp.minus(24, ChronoUnit.HOURS)) && it.timestamp.isBefore(timestamp)
//        }
//
//        val likeCounts= validVideos.groupBy { it.videoId }.maxByOrNull { it.value.size }?.key
//
//        println(likeCounts)
//
//        return likeCounts
//
//    }
//
//}
