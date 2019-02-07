removeNA <- function(df) {
    return(df[complete.cases(df), ])
}
