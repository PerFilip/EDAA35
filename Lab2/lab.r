removeNA <- function(df) {
    return(df[complete.cases(df), ])
}

analysePotentialOutliers <-function(data, threshold){  
    df <- data.frame()
    for (i in 1:(length(data))) {
        col <- data[ ,i]
        nol <- col[col<threshold[i]]
        ol <- col[col>threshold[i]]
        L <- c(colnames(data[i]),col[0], length(ol), mean(nol))
        df <- rbind(df, L)   
    }
    colnames(df) <- c("Variable","NrPotentialOutliers", "MeanNoOutliers")
    return(df)
}

contributors <- function(file, n) {
    data <- read.csv(file, sep="|", stringsAsFactors=F, header=F)
    users <- data[,2]
    dates <- data[,3]
    lastCommit <- sort(tapply(dates, users, max))
    print(lastCommit)
    sorted <- sort(table(users), decreasing=T)
    nusers <- sorted[1:n]
    dfnusers <- as.data.frame(nusers)
    barplot(dfnusers$Freq, names.arg=dfnusers$users)
}