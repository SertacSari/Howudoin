@RestController
@RequestMapping("/messages")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @PostMapping("/send")
    public ResponseEntity<?> sendMessage(@RequestBody Message message) {
        // Implementation
    }

    @GetMapping
    public ResponseEntity<?> getConversation(@RequestParam String friendId) {
        // Implementation
    }
}
