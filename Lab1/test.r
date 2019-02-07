data <- read.csv("http://fileadmin.cs.lth.se/cs/Education/EDAA35/lab1/weather.txt")
(max(data[,1])-min(data[,1]))/3600
summary(data$Temperature)
c2 <- data[,2]
length(c2[c2>0])/length(c2)