removeNA <- function(df) {
    return(df[complete.cases(df), ])
}

analysePotentialOutliers <-function(data, threshold){  
    df <- data.frame()
    for (i = 0; i < len(data); i++) {
        for (val in row) {
            if (val > threshold) {
            }
        }
        if (belowThreshold) {

        }
    }
}

# a <- c(12, NA, 10, NA)
# b <- c(NA, NA, 15, 20)
# df <- data.frame(a, b)
# print(removeNA(df))
# data <- data.frame(read.csv("~/Projects/EDAA35/Lab2/data/data.txt"))
# print(nrow(removeNA(data)))