# Racer
This is a small turn-based physics game in which players race to get from the start line to the finish line.
While a turn-based racing game may sound quite boring, the challenge stems from the fact that the acceleration
of a player can be no more than 1. For example, a player could do X+0, Y+1 the first turn and then X+1, Y+2 the second turn,
but for the third turn they would not be able to do X-1, Y+0. This leads to a feeling of control over the car due to the
turn-based nature until you find yourself trying to decelerate as you hurtle towards a wall.

At the moment, the game is rather barren of features (such as collision detection, multiplayer or in the case of the latest package
player input), but a whole host of features is planned and right off the bat custom maps can be used effortlessly.
More details on custom maps will be established as the kinks are worked out and standards are changed to better suit the game.
A rough roadmap of future plans for the game can be found in a comment at the beggining of Racer.java in beta_final_animation.
Not mentioned on here is the eventual port for Android and iOS. Android will be receiving priority since porting to Android will
be much easier since Java is the standard for Android coding and due to it being the platform I personally use so testing will
be much easier. The plan is for all platforms to be able to play together on a server that will cater to all platforms.
LAN is also a planned feature. Possibly to be implemented before a true online multiplayer depending on the difficulty of implementation
for the two.

In order to contribute to the project you will need to sync with the repo and configure Slick2D, a custom graphics package.
If you are interested in contributing and are having a hard time setting up Slick2D then send me a message
and I'll tell you what worked for me.
