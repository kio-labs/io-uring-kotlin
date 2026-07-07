import kotlinx.cinterop.ExperimentalForeignApi
import linux.uring.*

@OptIn(ExperimentalForeignApi::class)
fun main() {
    println("liburing version = ${io_uring_major_version()}.${io_uring_minor_version()}")
}