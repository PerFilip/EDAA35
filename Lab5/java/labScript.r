# function for plotting data
plotresult <- function(file , start = 1) {
  data <- read.csv(file)
  data <- data[start : nrow(data),]
  plot(data, type = 'l')
}
# system("java lab data1 result1 600")
# plotresult("result1.txt") # plot to screen
# pdf("result1.pdf") # Jämvikt ser ut att ha nåtts vid 
# plotresult("result1.txt") # plot to pdf file
sumMedel <- c()
for (i in 1:100) {
  system("java lab data1 result1 600")
  data <- read.csv("result1.txt")
  data <- data[400:nrow(data),]
  sumMedel <- c(sumMedel, mean(data))
  file.remove("result1.txt")
}
print(sumMedel)
medel = mean(sumMedel)
print(medel)
t.test(sumMedel)
# dev.off()

