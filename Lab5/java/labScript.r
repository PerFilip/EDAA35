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
sumMedel = list()
for (i in 10) {
  system("java lab data1 result1 600")
  data <- read.csv("result1.txt")
  data <- data[400:nrow(data),]
  sumMedel.add(mean(data))
  file.remove("result1.txt")
}
medel = mean(sumMedel)
interval = t.test(sumMedel)
print(interval)
dev.off()

