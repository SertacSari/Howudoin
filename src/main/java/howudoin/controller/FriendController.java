@RestController
@RequestMapping("/friends")
public class FriendController {
    @Autowired
    private FriendService friendService;

    @PostMapping("/add")
    public ResponseEntity<?> sendFriendRequest(@RequestBody FriendRequest request) {
        // Implementation
    }

    @PostMapping("/accept")
    public ResponseEntity<?> acceptFriendRequest(@RequestBody FriendRequest request) {
        // Implementation
    }

    @GetMapping
    public ResponseEntity<?> getFriends() {
        // Implementation
    }
}
