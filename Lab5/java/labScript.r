# function for plotting data
plotresult <- function(file , start = 1) {
  data <- read.csv(file)
  data <- data[start : nrow(data),]
  plot(data, type = 'l')
}
# system("java labSelfMade data1 result1TildaSort 600")
# plotresult("result1TildaSort.txt") # plot to screen
# pdf("result1TildaSort.pdf") # Jämvikt ser ut att ha nåtts vid 
# plotresult("result1TildaSort.txt") # plot to pdf file
sumMedel <- c()
for (i in 1:100) {
  system("java labSelfMade data1 result1tildasort 600")
  data <- read.csv("result1tildasort.txt")
  data <- data[250:nrow(data),]
  sumMedel <- c(sumMedel, mean(data))
  file.remove("result1tildasort.txt")
}
print(sumMedel)
medel = mean(sumMedel)
print(medel)
t.test(sumMedel)