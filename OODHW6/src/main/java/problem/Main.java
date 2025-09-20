package problem;

public class Main {

  public static void main(String args[]) {
    SocialPost post = new SocialPost.PostBuilder()
        .setContent("Hello World!")
        .setAuthor("Alice")
        .setType(PostType.TEXT)
        .addTag("#greeting")
        .build();
    System.out.println(
        "Base Post: \"" + post.getContent() + "\" by " + post.getAuthor() + " - Engagement: "
            + post.getEngagementScore());

    PostComponent withLike = new LikeButtonDecorator(post);
    System.out.println("With Like Button: Engagement: " + withLike.getEngagementScore());
    PostComponent withLikeShare = new ShareButtonDecorator(withLike);
    System.out.println("With Like + Share: Engagement: " + withLikeShare.getEngagementScore());
    PostComponent withAll = new CommentSectionDecorator(withLikeShare);
    System.out.println("With All Features: Engagement: " + withAll.getEngagementScore());

    Strategy friendsOnly = new FriendsOnlyStrategy();
    friendsOnly.adoptStrategy();
    Strategy publicStrategy = new PublicStrategy();
    publicStrategy.adoptStrategy();
    System.out.println();

    SocialPost template = new SocialPost.PostBuilder()
        .setContent("Daily announcement")
        .setAuthor("Admin")
        .setType(PostType.TEXT)
        .addTag("#daily")
        .build();
    SocialPost cloned = template.clone();
    System.out.println("Template post cloned: \"" + cloned.getContent() + "\" ready");

    for (int i = 0; i < 50; i++) {
      post.addObserver(new FollowerNotifier(post));
    }
    AnalyticsTracker tracker = new AnalyticsTracker(withLikeShare);
    post.addObserver(tracker);

    Command publishCommand = new PublishPostCommand(post);
    Command likeCommand = new LikePostCommand(post);

    System.out.println("Post published!");
    publishCommand.execute();

    System.out.println("Post liked!");
    likeCommand.execute();
  }
}
